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
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("==== TEST 3: seller findAll ====");

        list = sellerDao.findAll();
        for (Seller obj: list) {
            System.out.println(obj);
        }

        System.out.println("==== TEST 4: seller insert ====");

        Seller seller1 = new Seller(null,"Greg","Greg@gmail.com",new Date(),5000.0,department);
        sellerDao.insert(seller1);
        System.out.println("Inserted! New Id: " + seller1.getId());

        System.out.println("==== TEST 5: seller Update ====");

        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Updated Completed!");

        System.out.println("==== TEST 6: seller deleteById ====");
        seller = sellerDao.findById(14);
        sellerDao.deleteById(14);
        System.out.println("Deleted Completed!");



    }
}
