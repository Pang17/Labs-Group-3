package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			if ((r.getScore() >= 1) && (r.getScore() <= 12)) 
			{
			
			} else {
				fail("Score not in range");
			}
		}

	}

}
