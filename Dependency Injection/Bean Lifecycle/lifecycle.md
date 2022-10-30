Definition of Bean Lifecycle :- 

             Bean life cycle refers to when & how the bean is instantiated, what action it performs until it lives, and when & how it is destroyed

The following image shows the process flow of the bean life cycle.  

![image](https://user-images.githubusercontent.com/67563519/198857453-2fd070b2-1259-4152-b5ca-4671d6ef167b.png)



            init() method :- spring container starts up

            destroy() mehod :- closing the container


Ways to implement the life cycle of a bean

(i) By XML

(ii) By implementing interfaces

        we need to implements these two interfaces
        InitializingBean, DisposableBean.
        
        And need to override 
        afterPropertiesSet() and destroy() method.
        
(iii) Using Annotation

        we need annotate,
                          init() method by @PostConstruct annotation.
                         destroy() method by @PreDestroy annotation.
                         
                         
                         
References :
   GeeksForGeeks
