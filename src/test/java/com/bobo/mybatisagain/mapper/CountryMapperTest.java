package com.bobo.mybatisagain.mapper;/**
 * Created by wuyangbo on 2018/11/29.
 */

import com.bobo.mybatisagain.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;


/**
 * @program: mybatisagain
 * @description:
 * @author: wyb
 * @create: 2018-11-29 01:51
 **/
public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;
    @BeforeClass
    public static void init() {
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            List<Country> countryList = sqlSession.selectList("selectAll");
            printCountryList(countryList);
        }finally {
            sqlSession.close();
        }
        System.out.println("sdfsd");
    }

    private void printCountryList(List<Country> list) {
        for(Country country : list) {
            System.out.printf("%-4d%4s%4s\n",country.getId(),country.getCountryname(),country.getCountrycode());
        }
    }
}
