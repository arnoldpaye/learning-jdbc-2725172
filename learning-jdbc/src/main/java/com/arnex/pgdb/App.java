package com.arnex.pgdb;

import java.util.List;
import java.util.Optional;

import com.arnex.pgdb.data.dao.ServiceDao;
import com.arnex.pgdb.data.entity.Service;

public class App {
    public static void main(String[] args) {
        ServiceDao serviceDao = new ServiceDao();
        List<Service> services = serviceDao.getAll();
        System.out.println("**** SERVICES ****");
        System.out.println("\n*** GET_ALL ***");
        services.forEach(System.out::println);
        Optional<Service> service = serviceDao.getOne(services.get(0).getServiceId());
        System.out.println("\n*** GET ONE ***\n" + service.get());
    }
}
