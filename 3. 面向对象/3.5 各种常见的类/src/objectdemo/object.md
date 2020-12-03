## Object构造器
Object() 
## Object类的方法
1) protected Object	clone()
Creates and returns a copy of this object.
2) boolean	equals(Object obj)
Indicates whether some other object is "equal to" this one.
3) protected void	finalize()
Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
4) Class<?>	getClass()
Returns the runtime class of this Object.
5) int	hashCode()
Returns a hash code value for the object.
6) void	notify()
Wakes up a single thread that is waiting on this object's monitor.
7) void	notifyAll()
Wakes up all threads that are waiting on this object's monitor.
8) String	toString()
Returns a string representation of the object.
9) void	wait()
Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.
10) void	wait(long timeout)
Causes the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
11) void	wait(long timeout, int nanos)
Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.
