/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dsl.jbang.core.commands.catalog;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.dsl.jbang.core.commands.CamelJBangMain;
import org.apache.camel.tooling.model.DataFormatModel;
import picocli.CommandLine;

@CommandLine.Command(name = "dataformat", aliases = { "dataformat", "dataformats" },
                     description = "List data formats from the Camel Catalog")
public class CatalogDataFormat extends CatalogBaseCommand {

    public CatalogDataFormat(CamelJBangMain main) {
        super(main);
    }

    @Override
    List<Row> collectRows() {
        List<Row> rows = new ArrayList<>();
        for (String name : catalog.findDataFormatNames()) {
            DataFormatModel model = catalog.dataFormatModel(name);
            Row row = new Row();
            row.name = model.getName();
            row.level = model.getSupportLevel().name();
            row.description = model.getDescription();
            row.label = model.getLabel() != null ? model.getLabel() : "";
            rows.add(row);
        }
        return rows;
    }

}
