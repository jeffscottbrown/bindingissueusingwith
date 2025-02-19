package com.example

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import grails.testing.gorm.DataTest

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController>, DataTest {


Class[] getDomainClassesToMock() {
        Widget
    }

    void "test someTechnique"() {
        when:
        params.name = 'Some Name'
        params.size = '42'
        def model = controller.someTechnique()

        then:
        model.widget.name == 'Some Name'
        model.widget.size == 42
    }

    void "test anotherTechnique"() {
        when:
        params.nameParam = 'Some Other Name'
        params.sizeParam = '2112'
        def model = controller.anotherTechnique()

        then:
        model.widget.name == 'Some Other Name'
        model.widget.size == 2112
    }
}
