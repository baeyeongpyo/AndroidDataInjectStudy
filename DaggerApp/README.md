## Inject
의존성의 주입을 요청
Annotation으로 요청을하며 연결된 Component가 Module로 부터 객체를 생성하여 념겨받음.

##Component
연결된 Module을 이용하여 의존성 객체를 생성.
Inject으로 요청받은 인스턴스를 생성한 객체를 주입.
의존성을 요청받고 주입하는 Dagger의 주된 역확을 수행하게 됨

## Subcomponent
Component는 계층관계를 만들수 있음.
SubComponent는 Inner class 방식의 하위 계층의 Component.
Sub의 Sub도 가능하게 됨.
SubComponent는 Dagger의 중요한 컨셉의 Graph를 형성하게 함.
Inject으로 주입을 요청받으면 SubComponent에서 먼저 의존성을 검색하고, 없으면 부모로 올라가면서 검색함.

## Module
COmponent에 연결되어 의존성 객체를 생성함.
생성 후 Scope에 따라 관리를 함.

## Scope
생성된 객체의 LifeCycle 범위.
안드로이드에서는 주로 PerActivity, PerFragment 등으로 화면의 생명주기를 맞춰 주어야함.
Module에서는 Scope를 확인하고 객체를 관리함.


