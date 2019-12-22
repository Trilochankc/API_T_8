package com.trilochan.api_t_8.api;

import com.trilochan.api_t_8.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();
}
