/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Remote
public interface performance_manageRemote {

    void saveperformance(String performance, String feedback, String decipline, String empid, String date);

    List<PerformanceAndFeedback> view(String id);

    void delete_performance(String id);

    List<PerformanceAndFeedback> get_empFromid(String id);

    void update_performance(String id,String performance, String feedback, String decipline, String empid, String date);
    
}
