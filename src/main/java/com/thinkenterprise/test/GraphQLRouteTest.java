package com.thinkenterprise.test;

import java.io.IOException;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static graphql.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@GraphQLTest
public class GraphQLRouteTest {

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void routes() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource("graphql/routes.graphql");
        assertNotNull(response);
        assertTrue(response.isOk());
        assertEquals("1", response.get("$.data.routes.id"));
    }

}