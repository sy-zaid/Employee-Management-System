# ------------------------- TASK - 1 ------------------------- #
"""Develop a flight booking system that allows users to search for flights based on
departure and destination cities, departure date, etc. Use lists and tuples to store flight
information such as flight number, departure time, and available seats. Implement
decision statements and loops to handle user input, display available flights, and
manage booking transactions. Utilize functions for different stages of the booking
process, such as searching for flights, reserving seats, and generating booking
confirmations"""

import datetime

class FlightBookingSystem:
    def __init__(self,sys_name, sys_date,sys_time):
        self.sys_name = sys_name
        self.sys_date = sys_date
        self.sys_time = sys_time
        self.total_flights = 0
        self.flights_data = []
    
    def registerFlight(self):
        flight_num = int(input("Enter a flight number to register: "))
        dept_time = str(input("Enter a departure time: "))
        avail_seats = int(input("Enter available seats: "))
        self.flights_data.append([Flight(flight_num,dept_time,avail_seats)])
        self.total_flights += 1

    def displayFlights(self):
        numofflights = self.total_flights
        for i in range(numofflights):
            print(f"The available flights are:\nFlight number: {self.flights_data[i][0].flight_number}, departing at: {self.flights_data[i][0].departure_time} and available seats are: {self.flights_data[i][0].available_seats}")


class Flight(FlightBookingSystem):
    def __init__(self,flight_number,departure_time,available_seats):
        self.flight_number = flight_number
        self.departure_time = departure_time
        self.available_seats = available_seats
        self.passengers_count = 0
        self.passengers_data = []

class Passenger(FlightBookingSystem):
    def __init__(self,passenger_name,passenger_id,passenger_number,flightsys):
        self.passenger_name = passenger_name
        self.passenger_id = passenger_id
        self.passenger_number = passenger_number
        self.flightsys = flightsys

    def searchFlights(self):
        numofflights = self.flightsys.total_flights
        print(f"-------------------- FLIGHTS AVAILABLE -------------------- ")
        for i in range(numofflights):
            print(f"\nFlight number: {self.flightsys.flights_data[i][0].flight_number}, departing at: {self.flightsys.flights_data[i][0].departure_time} and available seats are: {self.flightsys.flights_data[i][0].available_seats} out of which {self.flightsys.flights_data[i][0].passengers_count} are filled.")

    def reserveSeat(self):
        flight_num = eval(input("Choose flight number to book: "))
        for i in range(self.flightsys.total_flights):
            if self.flightsys.flights_data[i][0].flight_number == flight_num:
                self.flightsys.flights_data[i][0].passengers_data.append([self.passenger_name,self.passenger_id,self.passenger_number])
                self.flightsys.flights_data[i][0].passengers_count += 1
                print(f"FLIGHT {flight_num} BOOKED SUCCESSFULLY!")
    

                
    
            

    

system = FlightBookingSystem("PIA",datetime.date,datetime.time)
user_1 = Passenger("Zaid",20,923000,system)
user_2 = Passenger("Zaid",20,923000,system)

# Registering flights on the system.
system.registerFlight()
system.registerFlight()


# user_1 searching for flight and reserving it.
user_1.searchFlights()
user_1.reserveSeat()

# user_2 searching for flight and reserving it.
user_2.searchFlights()
user_2.reserveSeat()
