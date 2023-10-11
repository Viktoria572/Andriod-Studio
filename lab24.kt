//Яременко Вікторія Варіант 1(31)

import java.util.*

// Patient class
data class Patient(
    val name: String,
    val birthYear: Int,
    val diagnosis: String,
    val admissionDate: Date,
    val dischargeDate: Date?
)

// Doctor class
data class Doctor(
    val fullName: String,
    val specialty: String,
    val yearsOfExperience: Int
)

fun main() {
    // Create Patient objects
    val patient1 = Patient("John Smith", 1980, "Flu", Date(), null)
    val patient2 = Patient("Mary Johnson", 1995, "Broken leg", Date(), Date())

    // Create Doctor objects
    val doctor1 = Doctor("Dr. Smith", "General Practitioner", 10)
    val doctor2 = Doctor("Dr. Johnson", "Surgeon", 15)

    // Display information about Patients
    println("Patient Information:")
    println("Patient 1: ${patient1.name}, Diagnosis: ${patient1.diagnosis}")
    println("Patient 2: ${patient2.name}, Diagnosis: ${patient2.diagnosis}")

    // Display information about Doctors
    println("\nDoctor Information:")
    println("Doctor 1: ${doctor1.fullName}, Specialty: ${doctor1.specialty}, Years of Experience: ${doctor1.yearsOfExperience} years")
    println("Doctor 2: ${doctor2.fullName}, Specialty: ${doctor2.specialty}, Years of Experience: ${doctor2.yearsOfExperience} years")
}
