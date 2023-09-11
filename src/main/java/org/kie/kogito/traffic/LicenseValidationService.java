/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.traffic;

import java.util.Date;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.RuleUnitData;
import org.drools.ruleunits.api.SingletonStore;
import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;

public class LicenseValidationService implements RuleUnitDefinition {
    private SingletonStore<Driver> driver;

    public LicenseValidationService() {
        this(DataSource.createSingleton());
    }

    public LicenseValidationService(SingletonStore<Driver> driver) {
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
        rulesFactory.rule("Hello world")
            .on(driver)
            .execute(r -> System.out.println(r + " is probably adriver"));
    }
}
