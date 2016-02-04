/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.sparkblitz.mongo.service;

import com.mongodb.DBCursor;

/**
 *
 * @author jguillen <jguillen@gocatapult.com>
 */
public interface DocumentDAOService<T> {
    public Object insert(T doc) throws Exception;
    public DBCursor find() throws Exception;
}
