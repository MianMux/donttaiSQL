package cn.edu.tyut.demo.dao;

import cn.edu.tyut.demo.pojo.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerMapper {
    List<Customer> findCustomerByJobOrName(Customer customer);
}
