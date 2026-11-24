# Java — Deadlock Prevention

Projeto básico desenvolvido em Java com o objetivo de estudar **Deadlock, bloqueio de recursos e estratégias de prevenção em aplicações multithread**.

## Objetivo

Simular um cenário de transferências bancárias simultâneas, onde duas threads realizam operações entre contas diferentes ao mesmo tempo.

O principal objetivo é demonstrar como a aquisição de locks em ordens diferentes pode provocar um Deadlock, fazendo com que as threads fiquem bloqueadas indefinidamente.

Em seguida, implementar uma estratégia de prevenção baseada na **ordenação de locks por ID**, garantindo que todas as threads adquiram os bloqueios seguindo a mesma ordem.

**Projeto desenvolvido para fins de estudo**, explorando a identificação, compreensão e prevenção de Deadlocks em Java.