package com.arnex.pgdb;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.arnex.pgdb.data.dao.CustomerDao;
import com.arnex.pgdb.data.dao.ServiceDao;
import com.arnex.pgdb.data.dao.SimpleProductDao;
import com.arnex.pgdb.data.entity.Customer;

public class App {
    public static void main(String[] args) {
        /*
         * ServiceDao serviceDao = new ServiceDao();
         * List<Service> services = serviceDao.getAll();
         * System.out.println("**** SERVICES ****");
         * System.out.println("\n*** GET_ALL ***");
         * services.forEach(System.out::println);
         * Optional<Service> service =
         * serviceDao.getOne(services.get(0).getServiceId());
         * System.out.println("\n*** GET ONE ***\n" + service.get());
         * Service newService = new Service();
         * newService.setName("FooBarBaz" + System.currentTimeMillis());
         * newService.setPrice(new BigDecimal(4.35));
         * newService = serviceDao.create(newService);
         * System.out.println("\n*** CREATE ***\n" + newService);
         * newService.setPrice(new BigDecimal(13.45));
         * newService = serviceDao.update(newService);
         * System.out.println("\n*** UPDATE ***\n" + newService);
         * serviceDao.delete(newService.getServiceId());
         * System.out.println("\n*** DELETE ***\n");
         */

        /*
         * CustomerDao customerDao = new CustomerDao();
         * List<Customer> customers = customerDao.getAll();
         * System.out.println("*** CUSTOMERS ***");
         * System.out.println("\n*** GET_ALL ***");
         * customers.forEach(System.out::println);
         * Optional<Customer> customer =
         * customerDao.getOne(customers.get(0).getCustomerId());
         * System.out.println("\n*** GET ONE ***\n" + customer.get());
         * Customer newCustomer = new Customer();
         * newCustomer.setFirstName("Arnold");
         * newCustomer.setLastName("Paye");
         * newCustomer.setEmail("arnoldpayet@gmail.com" + System.currentTimeMillis());
         * newCustomer.setPhone("(591) 777665552");
         * newCustomer.setAddress("Here and there");
         * newCustomer = customerDao.create(newCustomer);
         * System.out.println("\n*** CREATE ***\n" + newCustomer);
         * newCustomer.setAddress("Another place");
         * newCustomer = customerDao.update(newCustomer);
         * System.out.println("\n*** UPDATE ***\n" + newCustomer);
         * customerDao.delete(newCustomer.getCustomerId());
         * System.out.println("\n*** DELETE ***\n");
         */

        /*
         * System.out.println("\n\n*** SIMPLE PRODUCT ***");
         * SimpleProductDao simpleProductDao = new SimpleProductDao();
         * UUID productId = simpleProductDao.createProduct("foobarbaz" +
         * System.currentTimeMillis(), new BigDecimal(45.67),
         * "Jaloo");
         * System.out.println(productId);
         */

        /*
         * System.out.println("\n\n*** LIMIT ***");
         * ServiceDao serviceDao = new ServiceDao();
         * serviceDao.getAllLimit(2).forEach(System.out::println);
         */

        CustomerDao customerDao = new CustomerDao();
        System.out.println("\\*** PAGED");
        for (int i = 1; i < 11; i++) {
            System.out.println("Page number: " + i);
            customerDao.getAllPaged(i, 10).forEach(System.out::println);
        }
    }
}
