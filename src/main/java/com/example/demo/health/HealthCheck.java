package com.example.demo.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {
	
	@Override
    public Health health() {
		/**
		 * Perform some specific health check
		 * This could be a database availability check or any other custom app health check
		 */
		int errorCode = check(); 
        
        if (errorCode != 0) {
            return Health.down()
              .withDetail("Error Code", errorCode).build();
        }
        
        /**
         * You can toggle app instances out of service with 
         * an external boolean config property
         * 
         * if (externalConfigProp == true) {
         *     Health.outOfService();
         * }
         */
        
        return Health.up().build();
    }
     
    public int check() {
        /**
         *  Our logic to check health
         *  Change the value to anything >0 to flip 
         *  health status to DOWN
         */
        return 0;
    }

}
