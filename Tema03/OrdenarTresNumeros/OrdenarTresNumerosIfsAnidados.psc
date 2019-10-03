Algoritmo OrdenarTresNumerosIfsAnidados
	Escribir Introducir,a
	Leer a
	Escribir Introducir,b
	Leer b
	Escribir Introducir,c
	Leer c
	Si a<b Entonces
		Si a<c Entonces
			Escribir a
			Si b<c Entonces
				Escribir b
				Escribir c
			SiNo
				Escribir c
				Escribir b
			FinSi
		SiNo
			Escribir c
			Escribir a
			Escribir b
		FinSi
	SiNo
		Si b<c Entonces
			Escribir b
			Si a<c Entonces
				Escribir a
				Escribir c
			SiNo
				Escribir c
				Escribir a
			FinSi
		SiNo
			Escribir c
			Escribir b
			Escribir a
		FinSi
	FinSi
FinAlgoritmo

