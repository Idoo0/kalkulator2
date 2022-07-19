while True:
	x = int(input("X: "))
	opp = input("Opp: ")
	y = int(input("Y: "))

	match opp:
		case '+':
			print(f">>> {x+y}")
		case '-':
			print(f">>> {x-y}")
		case '*':
			print(f">>> {x*y}")
		case '/':
			if y == 0:
				print(">>> Nilai tidak terdefinisi")
			else:
				print(f">>> {x/y}")	
	confirm = input("ingin mengulang program? (y/n): ")
	if confirm == 'n' or confirm == 'N':
		break
