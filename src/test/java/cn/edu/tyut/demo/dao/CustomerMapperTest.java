package cn.edu.tyut.demo.dao;

import cn.edu.tyut.demo.pojo.Customer;
import cn.edu.tyut.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerMapperTest {

    @Test
    public void findCustomerByJobOrName() {
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setJob("teacher");
//        customer.setUsername("张三");
        List<Customer> customerList = customerMapper.findCustomerByJobOrName(customer);
        System.out.println(customerList);
        sqlSession.close();
    }

    @Test
    public void findCustomerByJobAndName() {
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setJob("teacher");
//        customer.setUsername("张三");
        List<Customer> customerList = customerMapper.findCustomerByJobOrName(customer);
        System.out.println(customerList);
        sqlSession.close();
    }
}