// ************************************************************************
// (c) 2016 GOBii Project
// Initial Version: Phil Glaser
// Create Date:   2016-03-25
// ************************************************************************
package org.gobiiproject.gobiiclient.dtorequests.dbops.crud;

import org.gobiiproject.gobiiclient.dtorequests.DtoRequestManifest;
import org.gobiiproject.gobiiclient.dtorequests.Helpers.Authenticator;
import org.gobiiproject.gobiiclient.dtorequests.Helpers.GlobalPkValues;
import org.gobiiproject.gobiiclient.dtorequests.Helpers.TestDtoFactory;
import org.gobiiproject.gobiiclient.dtorequests.Helpers.TestUtils;
import org.gobiiproject.gobiimodel.dto.container.ManifestDTO;
import org.gobiiproject.gobiimodel.types.GobiiEntityNameType;
import org.gobiiproject.gobiimodel.types.GobiiProcessType;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

public class DtoCrudRequestManifestTest implements DtoCrudRequestTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        Assert.assertTrue(Authenticator.authenticate());
    }

    @AfterClass
    public static void tearDownUpClass() throws Exception {
        Assert.assertTrue(Authenticator.deAuthenticate());
    }

    @Test
    @Override
    public void get() throws Exception {
        DtoRequestManifest dtoRequestManifest = new DtoRequestManifest();
        ManifestDTO ManifestDTORequest = new ManifestDTO();
        ManifestDTORequest.setManifestId(1);
        ManifestDTO ManifestDTOResponse = dtoRequestManifest.process(ManifestDTORequest);

        Assert.assertNotEquals(null, ManifestDTOResponse);
        Assert.assertFalse(TestUtils.checkAndPrintHeaderMessages(ManifestDTOResponse));
    }

    @Test
    @Override
    public void testEmptyResult() throws Exception {
    }


    @Test
    @Override
    public void create() throws Exception {

        DtoRequestManifest dtoRequestManifest = new DtoRequestManifest();

        // set the plain properties

        ManifestDTO manifestDTORequest = TestDtoFactory
                .makePopulatedManifestDTO(GobiiProcessType.CREATE, 1);
        ManifestDTO manifestDTOResponse = dtoRequestManifest.process(manifestDTORequest);

        Assert.assertNotEquals(null, manifestDTOResponse);
        Assert.assertFalse(TestUtils.checkAndPrintHeaderMessages(manifestDTOResponse));
        Assert.assertTrue(manifestDTOResponse.getManifestId() > 0);
        GlobalPkValues.getInstance().addPkVal(GobiiEntityNameType.MANIFESTS,
                manifestDTOResponse.getManifestId());

    }


    @Test
    @Override
    public void update() throws Exception {
        DtoRequestManifest dtoRequestManifest = new DtoRequestManifest();

        // create a new manifest for our test
        ManifestDTO newManifestDto = TestDtoFactory
                .makePopulatedManifestDTO(GobiiProcessType.CREATE, 1);
        ManifestDTO newManifestDTOResponse = dtoRequestManifest.process(newManifestDto);


        // re-retrieve the manifest we just created so we start with a fresh READ mode dto
        ManifestDTO ManifestDTORequest = new ManifestDTO();
        ManifestDTORequest.setManifestId(newManifestDTOResponse.getManifestId());
        ManifestDTO manifestDTOReceived = dtoRequestManifest.process(ManifestDTORequest);
        Assert.assertFalse(TestUtils.checkAndPrintHeaderMessages(manifestDTOReceived));


        // so this would be the typical workflow for the client app
        manifestDTOReceived.setGobiiProcessType(GobiiProcessType.UPDATE);
        String newDataFile = UUID.randomUUID().toString();
        manifestDTOReceived.setFilePath(newDataFile);

        ManifestDTO ManifestDTOResponse = dtoRequestManifest.process(manifestDTOReceived);
        Assert.assertFalse(TestUtils.checkAndPrintHeaderMessages(ManifestDTOResponse));

        ManifestDTO dtoRequestManifestReRetrieved =
                dtoRequestManifest.process(ManifestDTORequest);

        Assert.assertFalse(TestUtils.checkAndPrintHeaderMessages(dtoRequestManifestReRetrieved));

        Assert.assertTrue(dtoRequestManifestReRetrieved.getFilePath().equals(newDataFile));

    }

    @Override
    public void getList() throws Exception {

    }
}
