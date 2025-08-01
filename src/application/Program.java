package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department department = new Department(1,"Computers");


        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("==== TEST 2: seller findByDepartment ====");

        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }
    }
}
