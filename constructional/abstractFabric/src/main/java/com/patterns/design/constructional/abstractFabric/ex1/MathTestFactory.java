package com.patterns.design.constructional.abstractFabric.ex1;
// fabryka abstrakcyjna rodziny obiektów
abstract class MathTestFactory {
        public abstract IShape CreateShape();
        public abstract INumber CreateNumber();
}
