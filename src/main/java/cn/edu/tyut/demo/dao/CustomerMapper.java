package cn.edu.tyut.demo.dao;

import cn.edu.tyut.demo.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> findCustomerByJobOrName(Customer customer);
//    使用choose标签通过name或Job查找
    List<Customer> findCustomerByJobAndName(Customer customer);
//   set标签实例
    int updateCustomer(Customer customer);
//    foreach标签使用，通过id查询
    List<Customer> findCustomerById(List idList);
}
