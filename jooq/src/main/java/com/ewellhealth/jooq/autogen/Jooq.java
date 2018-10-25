/*
 * This file is generated by jOOQ.
*/
package com.ewellhealth.jooq.autogen;


import com.ewellhealth.jooq.autogen.tables.Username;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jooq extends SchemaImpl {

    private static final long serialVersionUID = -1402097196;

    /**
     * The reference instance of <code>jooq</code>
     */
    public static final Jooq JOOQ = new Jooq();

    /**
     * The table <code>jooq.username</code>.
     */
    public final Username USERNAME = com.ewellhealth.jooq.autogen.tables.Username.USERNAME;

    /**
     * No further instances allowed
     */
    private Jooq() {
        super("jooq", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Username.USERNAME);
    }
}
