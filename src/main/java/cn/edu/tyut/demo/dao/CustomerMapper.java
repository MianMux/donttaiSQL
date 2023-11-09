package cn.edu.tyut.demo.dao;

import cn.edu.tyut.demo.pojo.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerMapper {
    List<Customer> findCustomerByJobOrName(Customer customer);
//    使用choose标签通过name或Job查找
    List<Customer> findCustomerByJobAndName(Customer customer);
}
