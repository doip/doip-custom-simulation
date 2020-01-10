package doip.custom.simulation;

import static doip.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import doip.logging.LogManager;
import doip.logging.Logger;


/**
 * Template class for unit tests using junit.
 * It is required that the Java system property "log4j.configurationFile" needs to be set,
 * otherwise you will not see any log messages.  
 */
public class TestTemplate {

	private static Logger logger = LogManager.getLogger(TestTemplate.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.info("-----------------------------------------------------------------------------");
		logger.info(">>> public static void setUpBeforeClass()");
		
		// TODO: Implement me
		
		logger.info("<<< public static void setUpBeforeClass()");
		logger.info("-----------------------------------------------------------------------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		logger.info("-----------------------------------------------------------------------------");
		logger.info(">>> public static void tearDownAfterClass()");
		
		// TODO: Implement me
		
		logger.info("<<< public static void tearDownAfterClass()");
		logger.info("-----------------------------------------------------------------------------");
	}

	@Before
	public void setUp() throws Exception {
		logger.info("-----------------------------------------------------------------------------");
		logger.info(">>> public void setUp()");
		
		// TODO: Implement me
		
		logger.info("<<< public void setUp()");
		logger.info("-----------------------------------------------------------------------------");
	}

	@After
	public void tearDown() throws Exception {
		logger.info("-----------------------------------------------------------------------------");
		logger.info(">>> public void tearDown()");
		
		// TODO: Implement me
		
		logger.info("<<< public void tearDown()");
		logger.info("-----------------------------------------------------------------------------");
	}

	@Test
	public void test() {
		logger.info("#############################################################################");
		logger.info(">>> test()");
		
		// TODO: Implement me
		
		logger.info("<<< test()");
		logger.info("#############################################################################");
	}

}
