package com.example

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import grails.testing.gorm.DataTest

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController>, DataTest {


Class[] getDomainClassesToMock() {
        Widget
    }

    void "test someTechique"() {
        when:
        params.name = 'Some Name'
        params.size = '42'
        def model = controller.someTechnique()

        then:
        model.widget.name == 'Some Name'
        model.widget.size == 42
    }
}
