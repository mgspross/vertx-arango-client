package com.emikra.vertx.arangodb.http.query.aql;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

public interface ArangoAqlQueryCursorResource {

    void query(JsonObject options, Handler<AsyncResult<JsonObject>> handler);

    void next(String cursorId, Handler<AsyncResult<JsonObject>> handler);

}
