package org.miage.m2.intervenantsservice.boundary;

import org.miage.m2.intervenantsservice.entity.Intervenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bertran95u on 11/09/2017.
 */
//@RepositoryRestResource(collectionResourceRel = "intervenants")
public interface IntervenantResource extends JpaRepository<Intervenant, String> {
    // GET, POST, PUT, DELETE sont traitees automatiquements
}
