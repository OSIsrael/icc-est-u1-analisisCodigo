import random
import time
from metodos_ordenamiento import MetodosOrdenamiento
class Benchmarking:
    def __init__(self):
        print('Bench inicializado')
        self.mOrdenamiento=MetodosOrdenamiento()
        arreglo=self.build_arreglo(100000)

        tarea=lambda: self.mOrdenamiento.sortByBubble(arreglo)
        tiempoMillis=self.contar_con_current_time_milles(tarea)
        tiempoNano=self.contar_con_nano_time(tarea)
        print(f' Tiempo en millis {tiempoMillis}')
        print(f' Tiempo en nano  {tiempoNano}')

    def build_arreglo(self,tamanio):
        array=[]
        for i in range(tamanio):
            numero=random.randint(0,99999)
            array.append(numero)
        return array
    
    def contar_con_current_time_milles(self,tarea):
        inicio=time.time()
        tarea() 
        fin=time.time()
        duracion=(fin-inicio)
        return duracion
    
    
    def contar_con_nano_time(self,tarea):
        inicio=time.time_ns()
        tarea() 
        fin=time.time_ns()
        duracion=(fin-inicio)/1000000000.0
        return duracion
    
    