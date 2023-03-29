/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.VehicleOfInterest;

/**
 *
 * @author Max
 */
@Stateless
public class VehicleOfInterestFacade extends AbstractFacade<VehicleOfInterest> {

    @PersistenceContext(unitName = "VOI_Web_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehicleOfInterestFacade() {
        super(VehicleOfInterest.class);
    }
    
}
