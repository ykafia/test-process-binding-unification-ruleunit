package org.kie.kogito.traffic;

import java.util.Date;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.SingletonStore;
import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;

public class LicenseValidation2 implements RuleUnitDefinition{

    private SingletonStore<Driver> driver;

    public LicenseValidation2() {
        this(DataSource.createSingleton());
    }

    public LicenseValidation2(SingletonStore<Driver> driver) {
        this.driver = driver;
    }

    public void setDriver(SingletonStore<Driver> driver) {
        this.driver = driver;
    }

    public SingletonStore<Driver> getDriver() {
        return driver;
    }

    public Date getCurrentTime() {
        return new Date();
    }


    @Override
    public void defineRules(RulesFactory rulesFactory) {
        // rulesFactory
        //     .rule("MyDriver")
        //     .
    }
    
}
