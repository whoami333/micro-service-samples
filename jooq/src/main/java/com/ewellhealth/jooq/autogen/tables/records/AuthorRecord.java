/*
 * This file is generated by jOOQ.
*/
package com.ewellhealth.jooq.autogen.tables.records;


import com.ewellhealth.jooq.autogen.tables.Author;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -282524861;

    /**
     * Setter for <code>jooq.author.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.author.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq.author.authorname</code>.
     */
    public void setAuthorname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.author.authorname</code>.
     */
    public String getAuthorname() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Author.AUTHOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Author.AUTHOR.AUTHORNAME;
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
        return getAuthorname();
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
        return getAuthorname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value2(String value) {
        setAuthorname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorRecord
     */
    public AuthorRecord() {
        super(Author.AUTHOR);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(Integer id, String authorname) {
        super(Author.AUTHOR);

        set(0, id);
        set(1, authorname);
    }
}
