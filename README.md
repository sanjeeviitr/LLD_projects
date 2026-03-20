# 🚀 Concurrency Control & Locking – End-to-End Revision Notes

---

## 1. Concurrency Problem (Foundation)

### Definition
Concurrency occurs when multiple requests try to access or modify the same shared resource at the same time.

### Example (Seat Booking)
- Seat status = FREE
- User1, User2, User3 read simultaneously → all see FREE
- All update → BOOKED  
  Result: Same seat booked multiple times ❌

### Key Concepts
- Race Condition: Multiple operations compete → incorrect result
- Critical Section: Code that accesses shared resource

Example:
if (seat.status == FREE) {
seat.status = BOOKED;
}

---

## 2. Why synchronized is NOT enough

### Works:
- Single JVM (multi-threading)

### Fails:
- Distributed systems (multiple servers)

Example:
- User1 → Server A
- User2 → Server B  
  Each server has its own lock → no coordination ❌

Conclusion: Need Distributed Concurrency Control

---

## 3. Transactions (ACID)

### Purpose
Maintain database consistency

### Key Property
Atomicity → All or nothing

### Example (Money Transfer)
- A = 100, B = 50
- Deduct 20 from A → 80
- Add 20 to B → 70

Without transaction:
- If credit fails → A=80, B=50 ❌

With transaction:
- Failure → rollback → A=100, B=50 ✅

---

## 4. DB Locking

### Shared Lock (Read Lock)
- Multiple reads allowed
- No writes allowed

### Exclusive Lock (Write Lock)
- Only one writer allowed
- No reads or writes allowed

### Summary

| Lock Type | Read Allowed | Write Allowed |
|----------|-------------|--------------|
| Shared   | Yes         | No           |
| Exclusive| No          | No           |

---

## 5. Isolation Levels

### Problems

Dirty Read:
- Reading uncommitted data

Non-Repeatable Read:
- Same row → different values

Phantom Read:
- Same query → different number of rows

---

### Isolation Levels

| Level | Dirty Read | Non-Repeatable | Phantom |
|------|-----------|----------------|---------|
| Read Uncommitted | Allowed | Allowed | Allowed |
| Read Committed   | Prevented | Allowed | Allowed |
| Repeatable Read  | Prevented | Prevented | Allowed |
| Serializable     | Prevented | Prevented | Prevented |

---

### Locking Behavior

Read Uncommitted:
- No locks

Read Committed:
- Read → short shared lock (released immediately)
- Write → exclusive lock till commit

Repeatable Read:
- Read → shared lock till end of transaction
- Write → exclusive lock till end

Serializable:
- Same as repeatable read + range locks

---

### Key Insight
Higher isolation = More consistency  
Higher isolation = Less concurrency

---

## 6. Optimistic Concurrency Control

### Idea
Assume conflicts are rare

### Mechanism
Use versioning

### Flow
1. Read row (version = v1)
2. Perform logic
3. Update with condition:
   UPDATE table
   SET value = ?, version = version + 1
   WHERE id = ? AND version = v1;

4. If rows updated = 0 → conflict → retry

### Pros
- High performance
- No locks
- No deadlocks

### Cons
- Retry overhead

### Use Cases
- Low contention systems

---

## 7. Pessimistic Concurrency Control

### Idea
Assume conflicts WILL happen

### Mechanism
Lock resource before modifying

Example:
SELECT * FROM seat WHERE id = 1 FOR UPDATE;

### Pros
- Safe
- Prevents conflicts upfront

### Cons
- Slower
- Deadlocks possible

### Use Cases
- High contention systems

---

## 8. Deadlock

### Scenario
- T1 locks A → wants B
- T2 locks B → wants A

Both wait forever ❌

### Solutions
- Timeout
- Abort one transaction
- Retry

---

## 9. Optimistic vs Pessimistic

| Feature | Optimistic | Pessimistic |
|--------|------------|-------------|
| Approach | Versioning | Locking |
| Concurrency | High | Low |
| Deadlock | No | Possible |
| Performance | Fast | Slower |
| Conflict Handling | Retry | Prevent upfront |

---

## 10. Distributed Concurrency Control

### Why needed?
Multiple servers → local locks don’t work

### Solutions
- DB constraints (unique keys)
- Redis locks (SETNX)
- Queue-based serialization

---

## 11. Interview Answer Template

Step 1:
“This is a race condition on a shared resource.”

Step 2:
“Seat booking is the critical section.”

Step 3: Solutions

Optimistic:
- Use versioning + retry

Pessimistic:
- Use DB locks (SELECT FOR UPDATE)

Distributed:
- Redis lock / DB constraint

---

## 12. Key Takeaways

- Concurrency = Shared resource problem
- Transactions ensure consistency
- Locks control access
- Isolation controls visibility
- Optimistic = Retry-based
- Pessimistic = Lock-based

---

## Quick Memory Tricks

- Shared = Read
- Exclusive = Write
- Optimistic = Check & Retry
- Pessimistic = Lock & Wait
- Serializable = No anomalies allowed

---