package service.impl;

import com.mysql.cj.protocol.Resultset;
import model.service.Service;
import repository.BaseRepository;
import service.IServiceSvc;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceSvc implements IServiceSvc {
    IServiceSvc serviceSvc = new ServiceSvc();

    @Override
    public boolean addService(Service service) {
        return serviceSvc.addService(service);
    }

    @Override
    public List<Service> listService() {
        //lay ds service tu db
        return serviceSvc.listService();
    }

    @Override
    public Service getServiceById(int id) {
        return null;
    }

    @Override
    public boolean deleteService(int id) {
        return serviceSvc.deleteService(id);
    }
}
