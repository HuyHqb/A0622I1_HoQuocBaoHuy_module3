package repository.impl;

import model.service.Service;
import repository.BaseRepository;
import repository.IServiceRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepo implements IServiceRepo {
    private final String SElECT_ALL_SERVICE = "select * from service";
    private final String INSERT_INTO_SERVICE = "insert into service(name,area,rentPrice,maxPerson,rentTypeId,standard,otherServiceDescription,poolArea,floor,freeService) values(?,?,?,?,?,?,?,?,?,?)";
    private final String DELETE_STUDENT_BY_ID = "call delete_service_by_id(?)";

    @Override
    public boolean addService(Service service) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_SERVICE);
            preparedStatement.setString(1, service.getName());
            preparedStatement.setInt(2, service.getArea());
            preparedStatement.setDouble(3, service.getArea());
            preparedStatement.setInt(4, service.getMaxPerson());
            preparedStatement.setInt(6, service.getRentTypeId());
            preparedStatement.setString(6, service.getStandard());
            preparedStatement.setString(7, service.getOtherServiceDescription());
            preparedStatement.setDouble(8, service.getPoolArea());
            preparedStatement.setInt(9, service.getFloor());
            preparedStatement.setString(10, service.getFreeService());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return false;
    }

    @Override
    public List<Service> listService() {
        //lay ds service tu db
        List<Service> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SElECT_ALL_SERVICE);
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                int area = resultset.getInt("area");
                double rentPrice = resultset.getDouble("rentprice");
                int maxPerson = resultset.getInt("maxperson");
                int rentTypeId = resultset.getInt("renttype_id");
                String standard = resultset.getString("standard");
                String otherServiceDescription = resultset.getString("other_service_description");
                double poolArea = resultset.getDouble("pool_area");
                int floor = resultset.getInt("floor");
                String freeService = resultset.getString("free_service");
                Service service = new Service(id, name, area, rentPrice, maxPerson, rentTypeId, standard, otherServiceDescription, poolArea, floor, freeService);
                list.add(service);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public Service getServiceById(int id) {
        return null;
    }

    @Override
    public boolean deleteService(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_STUDENT_BY_ID);
            callableStatement.setInt(1, id);
            return callableStatement.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
