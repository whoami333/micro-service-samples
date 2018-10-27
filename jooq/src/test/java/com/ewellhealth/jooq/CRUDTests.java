package com.ewellhealth.jooq;

import com.ewellhealth.jooq.autogen.tables.Username;
import com.ewellhealth.jooq.autogen.tables.records.UsernameRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CRUDTests {
    @Autowired
    DSLContext dslContext;
    Username username = Username.USERNAME;

    // @Test
    // public void testInsertJooq() {
    //     dslContext.insertInto(username)
    //             .columns(username.ID, username.NAME, username.ADDRESS)
    //             .values(3, "li", "wuhan")
    //             .execute();
    // }

    // @Test
    // public void testInsertJooq2() {
    //       dslContext.insertInto(username, )
    //     dslContext.executeInsert(
    //             new UsernameRecord(4, "sun", "shanghai"));
    // }

    // @Test
    // public void testJooqRead() {
    //     Result<UsernameRecord> result = dslContext.selectQuery(username).fetch();
    //     System.out.println("=======================");
    //     System.out.println("=======================");
    //     System.out.println("=======================");
    //     System.out.println("=======================");
    //     for (UsernameRecord record : result) {
    //         System.out.println(record.getId() + ", "
    //                 + record.getName() + ", " + record.getAddress());
    //     }
    //     System.out.println("=======================");
    //     System.out.println("=======================");
    //     System.out.println("=======================");
    //     System.out.println("=======================");
    // }
}
