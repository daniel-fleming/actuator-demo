# Spring Boot Actuator Demo

The goal of this demo is to showcase a custom health check indicator.

In the HealthCheck class we can override the health() method of the HealthIndicator interface.  This allows for custom health checks at the application layer, including database health checks.
