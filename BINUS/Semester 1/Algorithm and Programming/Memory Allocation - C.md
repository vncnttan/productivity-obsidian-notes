Malloc = acquiring some memory space (RAM) managed by the OS used to be used by a program
de-memory Allocation = releasing those memory back

Static
- Allocated at compile time
- Stored at stack memory
Dynamic
- Allocated at run-time
- Stored at heap memory


`malloc` = allocate memory
`void *malloc(size_t size);`

`realloc` = changes dynamic memory size
`void *realloc(void *ptr, size_t size);`

`free` = to release memory
`free(ptr);`



