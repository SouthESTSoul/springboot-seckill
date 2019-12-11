package guhao.service.impl;

import static org.junit.Assert.fail;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import guhao.entity.Seckill;
import guhao.service.SeckillService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SeckillServiceImplTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillService seckillService;
    
	@Test
	public void testFindAll() {
	    List<Seckill> all = seckillService.findAll();
        logger.info("all={}", all);
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testExportSeckillUrl() {
		fail("Not yet implemented");
	}

	@Test
	public void testExecuteSeckill() {
		fail("Not yet implemented");
	}

}
