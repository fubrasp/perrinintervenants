package org.miage.m2.intervenantsservice.boundary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bertran95u on 11/09/2017.
 */

/* Boundary ==>
  E ==> Entity (Modele)
  C ==> Control
  B ==> Boundary

    GET ==> change pas la ressource
    POST
    PUT
    PATCH ==> modif sans impact dessus
    DELETE
    s a intervenant = collection
  */
//@RestController
public class TestIntervenant {
    @GetMapping("/intervenants")
    public String liste(){
        return "Duke, Tom";
    }
}