/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.ReasonForInterest;

/**
 *
 * @author Max
 */
@Stateless
public class ReasonForInterestFacade extends AbstractFacade<ReasonForInterest> {

    @PersistenceContext(unitName = "VOI_Web_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReasonForInterestFacade() {
        super(ReasonForInterest.class);
    }
    
}
