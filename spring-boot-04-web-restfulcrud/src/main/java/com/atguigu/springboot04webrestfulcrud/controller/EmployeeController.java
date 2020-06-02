package com.atguigu.springboot04webrestfulcrud.controller;

import com.atguigu.springboot04webrestfulcrud.dao.DepartmentDao;
import com.atguigu.springboot04webrestfulcrud.dao.EmployeeDao;
import com.atguigu.springboot04webrestfulcrud.entities.Department;
import com.atguigu.springboot04webrestfulcrud.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Map;

@Controller
public class EmployeeController {

    @Resource
    private EmployeeDao employeeDao;

    @Resource
    private DepartmentDao departmentDao;


    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();

        model.addAttribute("emps", employees);

        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }


    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }



    @GetMapping("/emp/{id}")
    public String addEmp(@PathVariable("id") Integer id, Map<String, Object> map) {
        Employee employee = employeeDao.get(id);
        Collection<Department> departments = departmentDao.getDepartments();
        map.put("departments", departments);
        map.put("employee", employee);
        return "emp/add";
    }



    @PutMapping("/emp")
    public String updateEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @DeleteMapping("/emp/{id}")
    public String updateEmp(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }



}
