package org.gobiiproject.gobiidao.resultset.access.impl;

import org.gobiiproject.gobiidao.GobiiDaoException;
import org.gobiiproject.gobiidao.resultset.access.RsOrganizationDao;
import org.gobiiproject.gobiidao.resultset.core.EntityPropertyParamNames;
import org.gobiiproject.gobiidao.resultset.core.SpRunnerCallable;
import org.gobiiproject.gobiidao.resultset.core.StoredProcExec;
import org.gobiiproject.gobiidao.resultset.sqlworkers.modify.SpInsOrganization;
import org.gobiiproject.gobiidao.resultset.sqlworkers.modify.SpUpdOrganization;
import org.gobiiproject.gobiidao.resultset.sqlworkers.read.*;
import org.gobiiproject.gobiidao.resultset.sqlworkers.read.SpGetOrganizationDetailsByOrganizationId;
import org.hibernate.exception.SQLGrammarException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Phil on 4/7/2016.
 */
public class RsOrganizationDaoImpl implements RsOrganizationDao {

    Logger LOGGER = LoggerFactory.getLogger(RsOrganizationDaoImpl.class);

    @Autowired
    private StoredProcExec storedProcExec = null;

    @Autowired
    private SpRunnerCallable spRunnerCallable;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ResultSet getOrganizationNames() throws GobiiDaoException {

        ResultSet returnVal = null;

        try {

            SpGetOrganizationNames spGetOrganizationNames = new SpGetOrganizationNames();
            storedProcExec.doWithConnection(spGetOrganizationNames);
            returnVal = spGetOrganizationNames.getResultSet();

        } catch (SQLGrammarException e) {

            LOGGER.error("Error retrieving organization names", e.getSQL(), e.getSQLException());
            throw (new GobiiDaoException(e.getSQLException()));

        }

        return returnVal;

    } //


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public ResultSet getOrganizationDetailsByOrganizationId(Integer organizationId) throws GobiiDaoException {

        ResultSet returnVal = null;

        try {

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("organizationId", organizationId);
            SpGetOrganizationDetailsByOrganizationId spGetOrganizationDetailsByOrganizationId = new SpGetOrganizationDetailsByOrganizationId(parameters);

            storedProcExec.doWithConnection(spGetOrganizationDetailsByOrganizationId);

            returnVal = spGetOrganizationDetailsByOrganizationId.getResultSet();

        } catch (SQLGrammarException e) {

            LOGGER.error("Error retrieving organization details", e.getSQL(), e.getSQLException());
            throw (new GobiiDaoException(e.getSQLException()));

        }

        return returnVal;

    } //

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Integer createOrganization(Map<String, Object> parameters) throws GobiiDaoException {

        Integer returnVal = null;

        try {

            spRunnerCallable.run(new SpInsOrganization(), parameters);
            returnVal = spRunnerCallable.getResult();

        } catch (SQLGrammarException e) {

            LOGGER.error("Error creating organization with SQL " + e.getSQL(), e.getSQLException());
            throw (new GobiiDaoException(e.getSQLException()));

        }

        return returnVal;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateOrganization(Map<String, Object> parameters) throws GobiiDaoException {

        try {

            spRunnerCallable.run(new SpUpdOrganization(), parameters);

        } catch (SQLGrammarException e) {

            LOGGER.error("Error updating organization with SQL " + e.getSQL(), e.getSQLException());
            throw (new GobiiDaoException(e.getSQLException()));
        }
    }

}
