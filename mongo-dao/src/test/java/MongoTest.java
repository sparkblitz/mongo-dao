/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

/**
 *
 * @author jguillen <jguillen@gocatapult.com>
 */
public class MongoTest {

   @Test
   public void test(){
       System.out.println(System.getenv("OPENSHIFT_MONGODB_DB_URL"));
   }
}
