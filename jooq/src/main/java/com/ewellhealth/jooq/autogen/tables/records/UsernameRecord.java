/*
 * This file is generated by jOOQ.
 */
package com.ewellhealth.jooq.autogen.tables.records;


import com.ewellhealth.jooq.autogen.tables.Username;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsernameRecord extends UpdatableRecordImpl<UsernameRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1976732072;

    /**
     * Setter for <code>jooq.username.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.username.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq.username.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.username.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq.username.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq.username.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Username.USERNAME.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Username.USERNAME.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Username.USERNAME.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernameRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernameRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernameRecord value3(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsernameRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsernameRecord
     */
    public UsernameRecord() {
        super(Username.USERNAME);
    }

    /**
     * Create a detached, initialised UsernameRecord
     */
    public UsernameRecord(Integer id, String name, String address) {
        super(Username.USERNAME);

        set(0, id);
        set(1, name);
        set(2, address);
    }
}
