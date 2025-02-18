package com.example

class DemoController {

    def someTechnique() { 
        def w = new Widget()
        w.with {
            name = params.name
            size = params.int('size')
        }
        [widget: w]
    }

    def anotherTechnique(String nameParam, int sizeParam) { 
        def w = new Widget()
        w.with {
            name = nameParam
            size = sizeParam
        }
        [widget: w]
    }
}
