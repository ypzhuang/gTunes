package com.gtunes



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(StoreController)
class StoreControllerTests {

    void testSomething() {
        controller.index()
        'Hello World' == response.text
    }
}
