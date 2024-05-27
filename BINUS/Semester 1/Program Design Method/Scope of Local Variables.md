Local variables only available or readable on that module/function only. If outside function/module is calling a variable with the same name, it will only search inside of that module only, meaning it can result as an error.

Local variables inside of different module can have the same identifier.

Different from [[Global Variables]] where every module can have an access to it.