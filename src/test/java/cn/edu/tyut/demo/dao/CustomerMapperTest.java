package cn.edu.tyut.demo.dao;

import cn.edu.tyut.demo.pojo.Customer;
import cn.edu.tyut.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    public void updateCustomer() {
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setId(1);
       customer.setUsername("张三");
       customer.setJob("student");
        customer.setPhone("78989870");
        customerMapper.updateCustomer(customer);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findCustomerById() {
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List idList = new ArrayList();
        idList.add(1);
        idList.add(2);

        List<Customer> customerList = customerMapper.findCustomerById(idList);
        System.out.println(customerList);
        sqlSession.close();
    }
}